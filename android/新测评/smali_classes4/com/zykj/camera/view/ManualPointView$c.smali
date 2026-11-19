# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public final Lcom/zykj/camera/view/ManualPointView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/camera/view/ManualPointView;->setImagePath(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/camera/view/ManualPointView;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/camera/view/ManualPointView;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/camera/view/ManualPointView$c;->a:Lcom/zykj/camera/view/ManualPointView;

    iput-object p2, p0, Lcom/zykj/camera/view/ManualPointView$c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView$c;->b:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/zykj/camera/view/ManualPointView$c;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Lcom/zykj/camera/view/ManualPointView$c;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 15
    .line 16
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-static {v0, v2, v3, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v1, v0}, Lcom/zykj/camera/view/ManualPointView;->d(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView$c;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 31
    .line 32
    .line 33
    return-void
.end method
