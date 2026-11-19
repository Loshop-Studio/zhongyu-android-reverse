.class abstract Landroidx/paging/PageFetcher$LoadRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/PageFetcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "LoadRequest"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PageFetcher$LoadRequest$Append;,
        Landroidx/paging/PageFetcher$LoadRequest$Prepend;,
        Landroidx/paging/PageFetcher$LoadRequest$Refresh;
    }
.end annotation


# instance fields
.field private final loadType:Landroidx/paging/LoadType;


# direct methods
.method private constructor <init>(Landroidx/paging/LoadType;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/PageFetcher$LoadRequest;->loadType:Landroidx/paging/LoadType;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/paging/LoadType;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/PageFetcher$LoadRequest;-><init>(Landroidx/paging/LoadType;)V

    return-void
.end method


# virtual methods
.method public final getLoadType()Landroidx/paging/LoadType;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcher$LoadRequest;->loadType:Landroidx/paging/LoadType;

    .line 2
    .line 3
    return-object v0
.end method
