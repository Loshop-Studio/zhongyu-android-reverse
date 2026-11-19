.class public final synthetic Lf4/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/j0;->a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lf4/j0;->a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->r(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroidx/paging/CombinedLoadStates;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
