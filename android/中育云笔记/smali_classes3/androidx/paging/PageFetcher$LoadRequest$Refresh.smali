.class public final Landroidx/paging/PageFetcher$LoadRequest$Refresh;
.super Landroidx/paging/PageFetcher$LoadRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/PageFetcher$LoadRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Refresh"
.end annotation


# instance fields
.field private final triggerRemoteRefresh:Z

.field private final type:Landroidx/paging/PageFetcher$RefreshType;


# direct methods
.method public constructor <init>(ZLandroidx/paging/PageFetcher$RefreshType;)V
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p0, v0, v1}, Landroidx/paging/PageFetcher$LoadRequest;-><init>(Landroidx/paging/LoadType;Lkotlin/jvm/internal/n;)V

    .line 10
    .line 11
    .line 12
    iput-boolean p1, p0, Landroidx/paging/PageFetcher$LoadRequest$Refresh;->triggerRemoteRefresh:Z

    .line 13
    .line 14
    iput-object p2, p0, Landroidx/paging/PageFetcher$LoadRequest$Refresh;->type:Landroidx/paging/PageFetcher$RefreshType;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final getTriggerRemoteRefresh()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/PageFetcher$LoadRequest$Refresh;->triggerRemoteRefresh:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getType()Landroidx/paging/PageFetcher$RefreshType;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcher$LoadRequest$Refresh;->type:Landroidx/paging/PageFetcher$RefreshType;

    .line 2
    .line 3
    return-object v0
.end method
