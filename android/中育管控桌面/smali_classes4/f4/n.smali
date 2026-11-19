.class public final synthetic Lf4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/n;->a:Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf4/n;->a:Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->q(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;Ljava/util/Map;)V

    return-void
.end method
