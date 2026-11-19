.class public final synthetic Lb5/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/actionbar/TitleBar;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/actionbar/TitleBar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/u1;->a:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/u1;->a:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->s(Lcom/xuexiang/xui/widget/actionbar/TitleBar;Landroid/view/View;)V

    return-void
.end method
