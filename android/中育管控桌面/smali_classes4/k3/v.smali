.class public final synthetic Lk3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

.field public final synthetic b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final synthetic c:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/v;->a:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    iput-object p2, p0, Lk3/v;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p3, p0, Lk3/v;->c:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lk3/v;->a:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    iget-object v1, p0, Lk3/v;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v2, p0, Lk3/v;->c:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2}, Lk3/d0;->m(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
