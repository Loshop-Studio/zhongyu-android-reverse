.class public final synthetic Ly6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Landroid/graphics/Bitmap;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lb7/t0;

.field public final synthetic e:Lcom/zykj/evaluation/ui/sheet/b;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/b;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ly6/b;->b:Landroid/graphics/Bitmap;

    iput-object p3, p0, Ly6/b;->c:Ljava/util/List;

    iput-object p4, p0, Ly6/b;->d:Lb7/t0;

    iput-object p5, p0, Ly6/b;->e:Lcom/zykj/evaluation/ui/sheet/b;

    iput-object p6, p0, Ly6/b;->f:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Ly6/b;->g:I

    iput p8, p0, Ly6/b;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Ly6/b;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Ly6/b;->b:Landroid/graphics/Bitmap;

    iget-object v2, p0, Ly6/b;->c:Ljava/util/List;

    iget-object v3, p0, Ly6/b;->d:Lb7/t0;

    iget-object v4, p0, Ly6/b;->e:Lcom/zykj/evaluation/ui/sheet/b;

    iget-object v5, p0, Ly6/b;->f:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Ly6/b;->g:I

    iget v7, p0, Ly6/b;->h:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->j(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
