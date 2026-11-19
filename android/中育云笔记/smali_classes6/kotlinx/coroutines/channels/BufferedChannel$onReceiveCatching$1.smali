.class final synthetic Lkotlinx/coroutines/channels/BufferedChannel$onReceiveCatching$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/BufferedChannel;->i()Lae/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lhd/q;"
    }
.end annotation


# static fields
.field public static final c:Lkotlinx/coroutines/channels/BufferedChannel$onReceiveCatching$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/channels/BufferedChannel$onReceiveCatching$1;

    invoke-direct {v0}, Lkotlinx/coroutines/channels/BufferedChannel$onReceiveCatching$1;-><init>()V

    sput-object v0, Lkotlinx/coroutines/channels/BufferedChannel$onReceiveCatching$1;->c:Lkotlinx/coroutines/channels/BufferedChannel$onReceiveCatching$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, Lkotlinx/coroutines/channels/BufferedChannel;

    const-string v3, "registerSelectForReceive"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final g(Lkotlinx/coroutines/channels/BufferedChannel;Lae/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lkotlinx/coroutines/channels/BufferedChannel;->E(Lkotlinx/coroutines/channels/BufferedChannel;Lae/k;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/channels/BufferedChannel;

    .line 2
    .line 3
    check-cast p2, Lae/k;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/channels/BufferedChannel$onReceiveCatching$1;->g(Lkotlinx/coroutines/channels/BufferedChannel;Lae/k;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 9
    .line 10
    return-object p1
.end method
