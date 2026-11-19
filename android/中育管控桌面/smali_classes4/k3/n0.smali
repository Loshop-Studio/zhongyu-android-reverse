.class public final synthetic Lk3/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/n0;->a:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk3/n0;->a:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    invoke-static {v0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->a(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
