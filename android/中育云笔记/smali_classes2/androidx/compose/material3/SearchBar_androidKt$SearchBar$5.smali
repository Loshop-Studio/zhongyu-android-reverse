.class final Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SearchBar_androidKt;->SearchBar-WuY5d9Q(Ljava/lang/String;Lhd/l;Lhd/l;ZLhd/l;Landroidx/compose/ui/Modifier;ZLhd/p;Lhd/p;Lhd/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lhd/q;Landroidx/compose/runtime/Composer;III)V
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

.field final synthetic $$default:I

.field final synthetic $active:Z

.field final synthetic $colors:Landroidx/compose/material3/SearchBarColors;

.field final synthetic $content:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $leadingIcon:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onActiveChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onQueryChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onSearch:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $placeholder:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $query:Ljava/lang/String;

.field final synthetic $shadowElevation:F

.field final synthetic $shape:Landroidx/compose/ui/graphics/Shape;

.field final synthetic $tonalElevation:F

.field final synthetic $trailingIcon:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $windowInsets:Landroidx/compose/foundation/layout/WindowInsets;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lhd/l;Lhd/l;ZLhd/l;Landroidx/compose/ui/Modifier;ZLhd/p;Lhd/p;Lhd/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lhd/q;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lhd/l;",
            "Lhd/l;",
            "Z",
            "Lhd/l;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lhd/p;",
            "Lhd/p;",
            "Lhd/p;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SearchBarColors;",
            "FF",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lhd/q;",
            "III)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$query:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$onQueryChange:Lhd/l;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$onSearch:Lhd/l;

    .line 6
    .line 7
    iput-boolean p4, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$active:Z

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$onActiveChange:Lhd/l;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$modifier:Landroidx/compose/ui/Modifier;

    .line 12
    .line 13
    iput-boolean p7, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$enabled:Z

    .line 14
    .line 15
    iput-object p8, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$placeholder:Lhd/p;

    .line 16
    .line 17
    iput-object p9, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$leadingIcon:Lhd/p;

    .line 18
    .line 19
    iput-object p10, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$trailingIcon:Lhd/p;

    .line 20
    .line 21
    iput-object p11, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$shape:Landroidx/compose/ui/graphics/Shape;

    .line 22
    .line 23
    iput-object p12, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$colors:Landroidx/compose/material3/SearchBarColors;

    .line 24
    .line 25
    iput p13, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$tonalElevation:F

    .line 26
    .line 27
    iput p14, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$shadowElevation:F

    .line 28
    .line 29
    iput-object p15, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$windowInsets:Landroidx/compose/foundation/layout/WindowInsets;

    .line 30
    .line 31
    move-object/from16 p1, p16

    .line 32
    .line 33
    iput-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 34
    .line 35
    move-object/from16 p1, p17

    .line 36
    .line 37
    iput-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$content:Lhd/q;

    .line 38
    .line 39
    move/from16 p1, p18

    .line 40
    .line 41
    iput p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$$changed:I

    .line 42
    .line 43
    move/from16 p1, p19

    .line 44
    .line 45
    iput p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$$changed1:I

    .line 46
    .line 47
    move/from16 p1, p20

    .line 48
    .line 49
    iput p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$$default:I

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 53
    .line 54
    .line 55
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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 22

    .line 2
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$query:Ljava/lang/String;

    iget-object v2, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$onQueryChange:Lhd/l;

    iget-object v3, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$onSearch:Lhd/l;

    iget-boolean v4, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$active:Z

    iget-object v5, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$onActiveChange:Lhd/l;

    iget-object v6, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v7, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$enabled:Z

    iget-object v8, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$placeholder:Lhd/p;

    iget-object v9, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$leadingIcon:Lhd/p;

    iget-object v10, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$trailingIcon:Lhd/p;

    iget-object v11, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$shape:Landroidx/compose/ui/graphics/Shape;

    iget-object v12, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$colors:Landroidx/compose/material3/SearchBarColors;

    iget v13, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$tonalElevation:F

    iget v14, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$shadowElevation:F

    iget-object v15, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$windowInsets:Landroidx/compose/foundation/layout/WindowInsets;

    move-object/from16 v16, v1

    iget-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v17, v1

    iget-object v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$content:Lhd/q;

    move-object/from16 v18, v1

    iget v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$$changed:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v19

    iget v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$$changed1:I

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v20

    iget v1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;->$$default:I

    move/from16 v21, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, p1

    invoke-static/range {v1 .. v21}, Landroidx/compose/material3/SearchBar_androidKt;->SearchBar-WuY5d9Q(Ljava/lang/String;Lhd/l;Lhd/l;ZLhd/l;Landroidx/compose/ui/Modifier;ZLhd/p;Lhd/p;Lhd/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lhd/q;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
