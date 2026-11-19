.class public final synthetic Landroidx/paging/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/paging/SimpleProducerScope;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/SimpleProducerScope;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/h;->c:Landroidx/paging/SimpleProducerScope;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/h;->c:Landroidx/paging/SimpleProducerScope;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->g(Landroidx/paging/SimpleProducerScope;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
