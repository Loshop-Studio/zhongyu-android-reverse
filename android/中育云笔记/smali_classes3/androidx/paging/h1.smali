.class public final synthetic Landroidx/paging/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/h1;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/h1;->c:Ljava/util/List;

    check-cast p1, Landroidx/paging/AccessorState;

    invoke-static {v0, p1}, Landroidx/paging/RemoteMediatorAccessImpl;->a(Ljava/util/List;Landroidx/paging/AccessorState;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
