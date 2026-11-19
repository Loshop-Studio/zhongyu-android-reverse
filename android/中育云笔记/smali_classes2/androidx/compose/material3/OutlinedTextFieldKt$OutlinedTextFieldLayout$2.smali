.class final Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/OutlinedTextFieldKt;->OutlinedTextFieldLayout(Landroidx/compose/ui/Modifier;Lhd/p;Lhd/q;Lhd/p;Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZFLhd/l;Lhd/p;Lhd/p;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/p;"
    }
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $animationProgress:F

.field final synthetic $container:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $label:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $leading:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onLabelMeasured:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $placeholder:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field

.field final synthetic $prefix:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $singleLine:Z

.field final synthetic $suffix:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $supporting:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $textField:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $trailing:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Lhd/p;Lhd/q;Lhd/p;Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZFLhd/l;Lhd/p;Lhd/p;Landroidx/compose/foundation/layout/PaddingValues;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lhd/p;",
            "Lhd/q;",
            "Lhd/p;",
            "Lhd/p;",
            "Lhd/p;",
            "Lhd/p;",
            "Lhd/p;",
            "ZF",
            "Lhd/l;",
            "Lhd/p;",
            "Lhd/p;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$modifier:Landroidx/compose/ui/Modifier;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$textField:Lhd/p;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$placeholder:Lhd/q;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$label:Lhd/p;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$leading:Lhd/p;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$trailing:Lhd/p;

    .line 12
    .line 13
    iput-object p7, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$prefix:Lhd/p;

    .line 14
    .line 15
    iput-object p8, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$suffix:Lhd/p;

    .line 16
    .line 17
    iput-boolean p9, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$singleLine:Z

    .line 18
    .line 19
    iput p10, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$animationProgress:F

    .line 20
    .line 21
    iput-object p11, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$onLabelMeasured:Lhd/l;

    .line 22
    .line 23
    iput-object p12, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$container:Lhd/p;

    .line 24
    .line 25
    iput-object p13, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$supporting:Lhd/p;

    .line 26
    .line 27
    iput-object p14, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 28
    .line 29
    iput p15, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$$changed:I

    .line 30
    .line 31
    move/from16 p1, p16

    .line 32
    .line 33
    iput p1, p0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$$changed1:I

    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    .line 2
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$textField:Lhd/p;

    iget-object v3, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$placeholder:Lhd/q;

    iget-object v4, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$label:Lhd/p;

    iget-object v5, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$leading:Lhd/p;

    iget-object v6, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$trailing:Lhd/p;

    iget-object v7, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$prefix:Lhd/p;

    iget-object v8, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$suffix:Lhd/p;

    iget-boolean v9, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$singleLine:Z

    iget v10, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$animationProgress:F

    iget-object v11, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$onLabelMeasured:Lhd/l;

    iget-object v12, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$container:Lhd/p;

    iget-object v13, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$supporting:Lhd/p;

    iget-object v14, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    iget v15, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$$changed:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    iget v15, v0, Landroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;->$$changed1:I

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v17

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v17}, Landroidx/compose/material3/OutlinedTextFieldKt;->OutlinedTextFieldLayout(Landroidx/compose/ui/Modifier;Lhd/p;Lhd/q;Lhd/p;Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZFLhd/l;Lhd/p;Lhd/p;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
