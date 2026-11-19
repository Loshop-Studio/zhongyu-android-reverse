.class public final synthetic Lb7/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lb7/w0;

.field public final synthetic b:Landroid/graphics/Bitmap;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/x0;->a:Lb7/w0;

    iput-object p2, p0, Lb7/x0;->b:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lb7/x0;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/x0;->a:Lb7/w0;

    iget-object v1, p0, Lb7/x0;->b:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lb7/x0;->c:Ljava/util/List;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, v2, p1}, Lb7/b1;->c(Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/content/Context;)Lcom/zykj/camera/view/ManualPointView;

    move-result-object p1

    return-object p1
.end method
