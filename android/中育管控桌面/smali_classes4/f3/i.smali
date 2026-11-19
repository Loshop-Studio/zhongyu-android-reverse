.class public final synthetic Lf3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/activity/GalleryActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/activity/GalleryActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/i;->a:Lcom/zykj/gallery/ui/activity/GalleryActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lf3/i;->a:Lcom/zykj/gallery/ui/activity/GalleryActivity;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/zykj/gallery/ui/activity/GalleryActivity;->s(Lcom/zykj/gallery/ui/activity/GalleryActivity;J)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
