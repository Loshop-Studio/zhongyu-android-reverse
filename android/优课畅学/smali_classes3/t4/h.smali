.class public final synthetic Lt4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/repository/SubscribeRepository;

.field public final synthetic b:Lcom/zykj/study/bean/FreeSubscribeReq;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/repository/SubscribeRepository;Lcom/zykj/study/bean/FreeSubscribeReq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/h;->a:Lcom/zykj/study/repository/SubscribeRepository;

    iput-object p2, p0, Lt4/h;->b:Lcom/zykj/study/bean/FreeSubscribeReq;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/h;->a:Lcom/zykj/study/repository/SubscribeRepository;

    iget-object v1, p0, Lt4/h;->b:Lcom/zykj/study/bean/FreeSubscribeReq;

    invoke-static {v0, v1}, Lcom/zykj/study/repository/SubscribeRepository;->b(Lcom/zykj/study/repository/SubscribeRepository;Lcom/zykj/study/bean/FreeSubscribeReq;)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method
