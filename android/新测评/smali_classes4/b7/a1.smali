.class public final synthetic Lb7/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/camera/view/ManualPointView;

.field public final synthetic b:Landroid/graphics/Matrix;

.field public final synthetic c:Landroid/graphics/Bitmap;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;Landroid/graphics/Bitmap;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/a1;->a:Lcom/zykj/camera/view/ManualPointView;

    iput-object p2, p0, Lb7/a1;->b:Landroid/graphics/Matrix;

    iput-object p3, p0, Lb7/a1;->c:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lb7/a1;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb7/a1;->a:Lcom/zykj/camera/view/ManualPointView;

    iget-object v1, p0, Lb7/a1;->b:Landroid/graphics/Matrix;

    iget-object v2, p0, Lb7/a1;->c:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lb7/a1;->d:Ljava/util/List;

    invoke-static {v0, v1, v2, v3}, Lb7/b1;->d(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;Landroid/graphics/Bitmap;Ljava/util/List;)V

    return-void
.end method
