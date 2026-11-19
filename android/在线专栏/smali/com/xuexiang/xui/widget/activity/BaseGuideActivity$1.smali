.class Lcom/xuexiang/xui/widget/activity/BaseGuideActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;->initGuideView(Ljava/util/List;Ljava/lang/Class;Ljava/lang/Class;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;

.field final synthetic val$cls:Ljava/lang/Class;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity$1;->this$0:Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity$1;->val$cls:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onJumpClick()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity$1;->this$0:Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity$1;->this$0:Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity$1;->val$cls:Ljava/lang/Class;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity$1;->this$0:Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
