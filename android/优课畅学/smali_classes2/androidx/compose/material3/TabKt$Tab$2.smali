.class final Landroidx/compose/material3/TabKt$Tab$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TabKt;->Tab-wqdebIU(ZLx7/a;Landroidx/compose/ui/Modifier;ZLx7/p;Lx7/p;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/p;"
    }
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $enabled:Z

.field final synthetic $icon:Lx7/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/p;"
        }
    .end annotation
.end field

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onClick:Lx7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/a;"
        }
    .end annotation
.end field

.field final synthetic $selected:Z

.field final synthetic $selectedContentColor:J

.field final synthetic $text:Lx7/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/p;"
        }
    .end annotation
.end field

.field final synthetic $unselectedContentColor:J


# direct methods
.method public constructor <init>(ZLx7/a;Landroidx/compose/ui/Modifier;ZLx7/p;Lx7/p;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lx7/a;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lx7/p;",
            "Lx7/p;",
            "JJ",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/compose/material3/TabKt$Tab$2;->$selected:Z

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/TabKt$Tab$2;->$onClick:Lx7/a;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/TabKt$Tab$2;->$modifier:Landroidx/compose/ui/Modifier;

    .line 6
    .line 7
    iput-boolean p4, p0, Landroidx/compose/material3/TabKt$Tab$2;->$enabled:Z

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/TabKt$Tab$2;->$text:Lx7/p;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/material3/TabKt$Tab$2;->$icon:Lx7/p;

    .line 12
    .line 13
    iput-wide p7, p0, Landroidx/compose/material3/TabKt$Tab$2;->$selectedContentColor:J

    .line 14
    .line 15
    iput-wide p9, p0, Landroidx/compose/material3/TabKt$Tab$2;->$unselectedContentColor:J

    .line 16
    .line 17
    iput-object p11, p0, Landroidx/compose/material3/TabKt$Tab$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 18
    .line 19
    iput p12, p0, Landroidx/compose/material3/TabKt$Tab$2;->$$changed:I

    .line 20
    .line 21
    iput p13, p0, Landroidx/compose/material3/TabKt$Tab$2;->$$default:I

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 25
    .line 26
    .line 27
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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/TabKt$Tab$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 14

    .line 2
    iget-boolean v0, p0, Landroidx/compose/material3/TabKt$Tab$2;->$selected:Z

    iget-object v1, p0, Landroidx/compose/material3/TabKt$Tab$2;->$onClick:Lx7/a;

    iget-object v2, p0, Landroidx/compose/material3/TabKt$Tab$2;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Landroidx/compose/material3/TabKt$Tab$2;->$enabled:Z

    iget-object v4, p0, Landroidx/compose/material3/TabKt$Tab$2;->$text:Lx7/p;

    iget-object v5, p0, Landroidx/compose/material3/TabKt$Tab$2;->$icon:Lx7/p;

    iget-wide v6, p0, Landroidx/compose/material3/TabKt$Tab$2;->$selectedContentColor:J

    iget-wide v8, p0, Landroidx/compose/material3/TabKt$Tab$2;->$unselectedContentColor:J

    iget-object v10, p0, Landroidx/compose/material3/TabKt$Tab$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget v11, p0, Landroidx/compose/material3/TabKt$Tab$2;->$$changed:I

    or-int/lit8 v11, v11, 0x1

    invoke-static {v11}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v12

    iget v13, p0, Landroidx/compose/material3/TabKt$Tab$2;->$$default:I

    move-object v11, p1

    invoke-static/range {v0 .. v13}, Landroidx/compose/material3/TabKt;->Tab-wqdebIU(ZLx7/a;Landroidx/compose/ui/Modifier;ZLx7/p;Lx7/p;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
