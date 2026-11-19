.class public Lcom/zykj/video/play/controller/TCControllerWindow$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/controller/TCControllerWindow;->setBackground(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/graphics/Bitmap;

.field public final synthetic b:Lcom/zykj/video/play/controller/TCControllerWindow;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/controller/TCControllerWindow;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$c;->b:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/video/play/controller/TCControllerWindow$c;->a:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$c;->a:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$c;->b:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->h(Lcom/zykj/video/play/controller/TCControllerWindow;)Landroid/widget/ImageView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$c;->b:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$c;->a:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/zykj/video/play/controller/TCControllerWindow;->j(Lcom/zykj/video/play/controller/TCControllerWindow;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$c;->b:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->h(Lcom/zykj/video/play/controller/TCControllerWindow;)Landroid/widget/ImageView;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow$c;->b:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 29
    .line 30
    invoke-static {v2}, Lcom/zykj/video/play/controller/TCControllerWindow;->i(Lcom/zykj/video/play/controller/TCControllerWindow;)Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v0, v1, v2}, Lcom/zykj/video/play/controller/TCControllerWindow;->f(Lcom/zykj/video/play/controller/TCControllerWindow;Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
