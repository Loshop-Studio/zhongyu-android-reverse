.class public final synthetic Lf4/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/x;->a:Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lf4/x;->a:Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;

    invoke-static {v0}, Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;->p(Lcom/zykj/huiwei/launcher/ui/fragment/MainFragment;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
