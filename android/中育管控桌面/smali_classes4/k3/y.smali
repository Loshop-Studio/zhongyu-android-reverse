.class public final synthetic Lk3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Landroid/app/Activity;Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/y;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iput-object p2, p0, Lk3/y;->b:Landroid/app/Activity;

    iput-object p3, p0, Lk3/y;->c:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lk3/y;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iget-object v1, p0, Lk3/y;->b:Landroid/app/Activity;

    iget-object v2, p0, Lk3/y;->c:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    invoke-static {v0, v1, v2}, Lk3/d0;->k(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Landroid/app/Activity;Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
