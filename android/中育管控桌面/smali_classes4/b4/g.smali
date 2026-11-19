.class public final synthetic Lb4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/g;->a:Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/g;->a:Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;

    check-cast p1, Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->q(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Lcom/zykj/huiwei/launcher/proto/m;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
