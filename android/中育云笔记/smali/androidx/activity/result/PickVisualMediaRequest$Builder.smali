.class public final Landroidx/activity/result/PickVisualMediaRequest$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/PickVisualMediaRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private accentColor:J

.field private defaultTab:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;

.field private isCustomAccentColorApplied:Z

.field private isOrderedSelection:Z

.field private maxItems:I

.field private mediaType:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->mediaType:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;

    .line 7
    .line 8
    sget-object v0, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;->Companion:Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia$Companion;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia$Companion;->getMaxItems$activity_release()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->maxItems:I

    .line 15
    .line 16
    sget-object v0, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab;

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->defaultTab:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final build()Landroidx/activity/result/PickVisualMediaRequest;
    .locals 3

    .line 1
    new-instance v0, Landroidx/activity/result/PickVisualMediaRequest;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/activity/result/PickVisualMediaRequest;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->mediaType:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/activity/result/PickVisualMediaRequest;->setMediaType$activity_release(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V

    .line 9
    .line 10
    .line 11
    iget v1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->maxItems:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/activity/result/PickVisualMediaRequest;->setMaxItems$activity_release(I)V

    .line 14
    .line 15
    .line 16
    iget-boolean v1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->isOrderedSelection:Z

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/activity/result/PickVisualMediaRequest;->setOrderedSelection$activity_release(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->defaultTab:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/activity/result/PickVisualMediaRequest;->setDefaultTab$activity_release(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)V

    .line 24
    .line 25
    .line 26
    iget-boolean v1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->isCustomAccentColorApplied:Z

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroidx/activity/result/PickVisualMediaRequest;->setCustomAccentColorApplied$activity_release(Z)V

    .line 29
    .line 30
    .line 31
    iget-wide v1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->accentColor:J

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroidx/activity/result/PickVisualMediaRequest;->setAccentColor$activity_release(J)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final setAccentColor(J)Landroidx/activity/result/PickVisualMediaRequest$Builder;
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->accentColor:J

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->isCustomAccentColorApplied:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public final setDefaultTab(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest$Builder;
    .locals 1

    .line 1
    const-string v0, "defaultTab"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->defaultTab:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setMaxItems(I)Landroidx/activity/result/PickVisualMediaRequest$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x2L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->maxItems:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;
    .locals 1

    .line 1
    const-string v0, "mediaType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->mediaType:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setOrderedSelection(Z)Landroidx/activity/result/PickVisualMediaRequest$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/activity/result/PickVisualMediaRequest$Builder;->isOrderedSelection:Z

    .line 2
    .line 3
    return-object p0
.end method
