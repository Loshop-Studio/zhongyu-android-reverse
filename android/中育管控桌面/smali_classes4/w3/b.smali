.class public final Lw3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/api/GatewayService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/api/GatewayService;)V
    .locals 1

    .line 1
    const-string v0, "gatewayService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lw3/b;->a:Lcom/zykj/huiwei/launcher/api/GatewayService;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/b;->a:Lcom/zykj/huiwei/launcher/api/GatewayService;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/zykj/huiwei/launcher/api/GatewayService;->gateway(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
