.class public final synthetic Landroidx/paging/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Landroidx/paging/LoadStates;

.field public final synthetic g:Landroidx/paging/LoadStates;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/r0;->c:Ljava/util/List;

    iput p2, p0, Landroidx/paging/r0;->d:I

    iput p3, p0, Landroidx/paging/r0;->e:I

    iput-object p4, p0, Landroidx/paging/r0;->f:Landroidx/paging/LoadStates;

    iput-object p5, p0, Landroidx/paging/r0;->g:Landroidx/paging/LoadStates;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/paging/r0;->c:Ljava/util/List;

    iget v1, p0, Landroidx/paging/r0;->d:I

    iget v2, p0, Landroidx/paging/r0;->e:I

    iget-object v3, p0, Landroidx/paging/r0;->f:Landroidx/paging/LoadStates;

    iget-object v4, p0, Landroidx/paging/r0;->g:Landroidx/paging/LoadStates;

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/paging/PagingData$Companion;->b(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    move-result-object v0

    return-object v0
.end method
