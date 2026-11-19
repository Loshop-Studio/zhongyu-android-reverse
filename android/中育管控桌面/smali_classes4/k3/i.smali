.class public final synthetic Lk3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/i;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iput-object p2, p0, Lk3/i;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lk3/i;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iget-object v1, p0, Lk3/i;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->a(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
