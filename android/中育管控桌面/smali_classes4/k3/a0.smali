.class public final synthetic Lk3/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

.field public final synthetic b:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

.field public final synthetic c:Landroidx/navigation/NavHostController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Landroidx/navigation/NavHostController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/a0;->a:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    iput-object p2, p0, Lk3/a0;->b:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iput-object p3, p0, Lk3/a0;->c:Landroidx/navigation/NavHostController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lk3/a0;->a:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    iget-object v1, p0, Lk3/a0;->b:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iget-object v2, p0, Lk3/a0;->c:Landroidx/navigation/NavHostController;

    check-cast p1, Lcom/zykj/gallery/bean/GalleryImgBean;

    invoke-static {v0, v1, v2, p1}, Lk3/d0;->d(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Landroidx/navigation/NavHostController;Lcom/zykj/gallery/bean/GalleryImgBean;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
