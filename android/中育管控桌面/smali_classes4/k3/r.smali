.class public final synthetic Lk3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

.field public final synthetic b:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Landroidx/compose/runtime/MutableState;

.field public final synthetic e:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/r;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iput-object p2, p0, Lk3/r;->b:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    iput-object p3, p0, Lk3/r;->c:Landroid/content/Context;

    iput-object p4, p0, Lk3/r;->d:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lk3/r;->e:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lk3/r;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iget-object v1, p0, Lk3/r;->b:Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    iget-object v2, p0, Lk3/r;->c:Landroid/content/Context;

    iget-object v3, p0, Lk3/r;->d:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lk3/r;->e:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2, v3, v4}, Lk3/d0;->i(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
