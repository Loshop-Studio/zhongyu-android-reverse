.class public final synthetic Lt2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/common/entity/ResourceEntity;

    invoke-static {p1}, Lcom/friday/document/sync/SyncStateOne;->b(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
