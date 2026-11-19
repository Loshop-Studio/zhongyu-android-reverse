.class public final synthetic Lk3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/gallery/bean/GalleryImgBean;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/gallery/bean/GalleryImgBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/j;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lk3/j;->b:Lcom/zykj/gallery/bean/GalleryImgBean;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lk3/j;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lk3/j;->b:Lcom/zykj/gallery/bean/GalleryImgBean;

    invoke-static {v0, v1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->j(Lkotlin/jvm/functions/Function1;Lcom/zykj/gallery/bean/GalleryImgBean;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
