.class public final synthetic Lx3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/j;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx3/j;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
