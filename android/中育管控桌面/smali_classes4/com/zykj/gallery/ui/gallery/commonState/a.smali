.class public final synthetic Lcom/zykj/gallery/ui/gallery/commonState/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/commonState/a;->a:Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/commonState/a;->a:Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;->a(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
