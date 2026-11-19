.class public final synthetic Lx3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/l;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx3/l;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    invoke-static {v0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->h(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
