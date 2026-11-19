.class public final synthetic Lb4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/c;->a:Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/c;->a:Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;

    check-cast p1, Landroidx/work/WorkInfo;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->p(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Landroidx/work/WorkInfo;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
