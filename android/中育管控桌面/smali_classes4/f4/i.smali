.class public final synthetic Lf4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/i;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lf4/i;->a:Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;

    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;->u(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
