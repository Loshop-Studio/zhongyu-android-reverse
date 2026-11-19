.class public final synthetic Landroidx/paging/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Landroidx/paging/LoadStates;

.field public final synthetic d:Landroidx/paging/LoadStates;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/u0;->c:Landroidx/paging/LoadStates;

    iput-object p2, p0, Landroidx/paging/u0;->d:Landroidx/paging/LoadStates;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/u0;->c:Landroidx/paging/LoadStates;

    iget-object v1, p0, Landroidx/paging/u0;->d:Landroidx/paging/LoadStates;

    invoke-static {v0, v1}, Landroidx/paging/PagingData$Companion;->a(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    move-result-object v0

    return-object v0
.end method
