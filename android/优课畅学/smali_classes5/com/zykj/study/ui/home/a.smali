.class public final synthetic Lcom/zykj/study/ui/home/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/HomeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/HomeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/a;->a:Lcom/zykj/study/ui/home/HomeFragment;

    return-void
.end method


# virtual methods
.method public final a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/a;->a:Lcom/zykj/study/ui/home/HomeFragment;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->c(Lcom/zykj/study/ui/home/HomeFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method
