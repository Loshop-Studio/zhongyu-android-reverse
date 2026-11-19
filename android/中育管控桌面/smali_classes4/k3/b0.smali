.class public final synthetic Lk3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

.field public final synthetic b:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/b0;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iput-object p2, p0, Lk3/b0;->b:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lk3/b0;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iget-object v1, p0, Lk3/b0;->b:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    invoke-static {v0, v1}, Lk3/d0;->f(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
