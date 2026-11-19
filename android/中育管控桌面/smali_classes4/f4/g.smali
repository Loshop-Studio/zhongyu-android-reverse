.class public final synthetic Lf4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/chad/library/adapter/base/listener/OnItemClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/g;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    return-void
.end method


# virtual methods
.method public final onItemClick(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf4/g;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    invoke-static {v0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;->q(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method
