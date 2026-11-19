.class final Landroidx/paging/SimpleProducerScopeImpl$awaitClose$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/SimpleProducerScopeImpl;->awaitClose(Lhd/a;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $cont:Lsd/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/j;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsd/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/j;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$2$1;->$cont:Lsd/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$2$1;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    iget-object p1, p0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$2$1;->$cont:Lsd/j;

    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    sget-object v0, Lqc/q;->a:Lqc/q;

    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
