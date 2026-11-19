.class public final synthetic Lf3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Lcom/zykj/gallery/ui/activity/GalleryActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/zykj/gallery/ui/activity/GalleryActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/c;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lf3/c;->b:Lcom/zykj/gallery/ui/activity/GalleryActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lf3/c;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Lf3/c;->b:Lcom/zykj/gallery/ui/activity/GalleryActivity;

    check-cast p1, Landroidx/compose/foundation/layout/PaddingValues;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/zykj/gallery/ui/activity/GalleryActivity;->m(Landroidx/navigation/NavHostController;Lcom/zykj/gallery/ui/activity/GalleryActivity;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
