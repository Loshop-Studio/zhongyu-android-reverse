.class public final synthetic Lud/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:Lkotlinx/coroutines/channels/BufferedChannel;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/channels/BufferedChannel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud/a;->c:Lkotlinx/coroutines/channels/BufferedChannel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/a;->c:Lkotlinx/coroutines/channels/BufferedChannel;

    check-cast p1, Lae/k;

    invoke-static {v0, p1, p2, p3}, Lkotlinx/coroutines/channels/BufferedChannel;->c(Lkotlinx/coroutines/channels/BufferedChannel;Lae/k;Ljava/lang/Object;Ljava/lang/Object;)Lhd/q;

    move-result-object p1

    return-object p1
.end method
