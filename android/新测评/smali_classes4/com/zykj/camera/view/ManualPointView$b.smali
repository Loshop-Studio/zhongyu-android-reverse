.class public final Lcom/zykj/camera/view/ManualPointView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/camera/view/ManualPointView;->setBackBitmap(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/camera/view/ManualPointView;

.field public final synthetic b:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/camera/view/ManualPointView$b;->a:Lcom/zykj/camera/view/ManualPointView;

    iput-object p2, p0, Lcom/zykj/camera/view/ManualPointView$b;->b:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView$b;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/camera/view/ManualPointView$b;->b:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/zykj/camera/view/ManualPointView;->d(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Bitmap;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView$b;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
