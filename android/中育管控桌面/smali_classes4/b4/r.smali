.class public final synthetic Lb4/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/r;->a:Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/r;->a:Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;

    invoke-static {v0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->n(Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object v0

    return-object v0
.end method
