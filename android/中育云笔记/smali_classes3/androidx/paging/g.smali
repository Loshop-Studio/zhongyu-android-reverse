.class public final synthetic Landroidx/paging/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/paging/CachedPageEventFlow;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/CachedPageEventFlow;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/g;->c:Landroidx/paging/CachedPageEventFlow;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/g;->c:Landroidx/paging/CachedPageEventFlow;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Landroidx/paging/CachedPageEventFlow;->a(Landroidx/paging/CachedPageEventFlow;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
