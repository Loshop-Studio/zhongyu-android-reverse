.class public final synthetic Lk3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/gallery/bean/GalleryImgBean;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/gallery/bean/GalleryImgBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/l;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lk3/l;->b:Lcom/zykj/gallery/bean/GalleryImgBean;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lk3/l;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lk3/l;->b:Lcom/zykj/gallery/bean/GalleryImgBean;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->c(Lkotlin/jvm/functions/Function1;Lcom/zykj/gallery/bean/GalleryImgBean;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
