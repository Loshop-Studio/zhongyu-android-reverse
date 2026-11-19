.class public final synthetic Landroidx/paging/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/paging/ViewportHint;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/ViewportHint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/r;->c:Landroidx/paging/ViewportHint;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/r;->c:Landroidx/paging/ViewportHint;

    check-cast p1, Landroidx/paging/HintHandler$HintFlow;

    check-cast p2, Landroidx/paging/HintHandler$HintFlow;

    invoke-static {v0, p1, p2}, Landroidx/paging/HintHandler;->a(Landroidx/paging/ViewportHint;Landroidx/paging/HintHandler$HintFlow;Landroidx/paging/HintHandler$HintFlow;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
