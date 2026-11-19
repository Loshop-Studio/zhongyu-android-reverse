.class public final synthetic Lf3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Lcom/zykj/gallery/ui/activity/GalleryActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/zykj/gallery/ui/activity/GalleryActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/d;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lf3/d;->b:Lcom/zykj/gallery/ui/activity/GalleryActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lf3/d;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Lf3/d;->b:Lcom/zykj/gallery/ui/activity/GalleryActivity;

    check-cast p1, Landroidx/navigation/NavGraphBuilder;

    invoke-static {v0, v1, p1}, Lcom/zykj/gallery/ui/activity/GalleryActivity;->p(Landroidx/navigation/NavHostController;Lcom/zykj/gallery/ui/activity/GalleryActivity;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
