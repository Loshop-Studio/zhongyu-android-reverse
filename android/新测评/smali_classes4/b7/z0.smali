.class public final synthetic Lb7/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/camera/view/ManualPointView;

.field public final synthetic b:Landroid/graphics/Matrix;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/z0;->a:Lcom/zykj/camera/view/ManualPointView;

    iput-object p2, p0, Lb7/z0;->b:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/z0;->a:Lcom/zykj/camera/view/ManualPointView;

    iget-object v1, p0, Lb7/z0;->b:Landroid/graphics/Matrix;

    invoke-static {v0, v1}, Lb7/b1;->b(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
