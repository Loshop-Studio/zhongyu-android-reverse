.class public final synthetic Lb7/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Lb7/w0;

.field public final synthetic c:Landroid/graphics/Bitmap;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/y0;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lb7/y0;->b:Lb7/w0;

    iput-object p3, p0, Lb7/y0;->c:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lb7/y0;->d:Ljava/util/List;

    iput p5, p0, Lb7/y0;->e:I

    iput p6, p0, Lb7/y0;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lb7/y0;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb7/y0;->b:Lb7/w0;

    iget-object v2, p0, Lb7/y0;->c:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lb7/y0;->d:Ljava/util/List;

    iget v4, p0, Lb7/y0;->e:I

    iget v5, p0, Lb7/y0;->f:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lb7/b1;->a(Landroidx/compose/ui/Modifier;Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
