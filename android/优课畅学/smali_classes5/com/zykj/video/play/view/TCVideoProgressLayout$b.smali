.class public Lcom/zykj/video/play/view/TCVideoProgressLayout$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/video/play/view/TCVideoProgressLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/view/TCVideoProgressLayout;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/view/TCVideoProgressLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVideoProgressLayout$b;->a:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/video/play/view/TCVideoProgressLayout;Lcom/zykj/video/play/view/TCVideoProgressLayout$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/video/play/view/TCVideoProgressLayout$b;-><init>(Lcom/zykj/video/play/view/TCVideoProgressLayout;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVideoProgressLayout$b;->a:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->a(Lcom/zykj/video/play/view/TCVideoProgressLayout;)Landroid/widget/ImageView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVideoProgressLayout$b;->a:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->a(Lcom/zykj/video/play/view/TCVideoProgressLayout;)Landroid/widget/ImageView;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVideoProgressLayout$b;->a:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
