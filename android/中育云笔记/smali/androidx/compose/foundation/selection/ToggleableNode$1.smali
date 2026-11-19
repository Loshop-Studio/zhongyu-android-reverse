.class final Landroidx/compose/foundation/selection/ToggleableNode$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/selection/ToggleableNode;-><init>(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLandroidx/compose/ui/semantics/Role;Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $onValueChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $value:Z


# direct methods
.method public constructor <init>(Lhd/l;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/selection/ToggleableNode$1;->$onValueChange:Lhd/l;

    .line 2
    .line 3
    iput-boolean p2, p0, Landroidx/compose/foundation/selection/ToggleableNode$1;->$value:Z

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/selection/ToggleableNode$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/selection/ToggleableNode$1;->$onValueChange:Lhd/l;

    iget-boolean v1, p0, Landroidx/compose/foundation/selection/ToggleableNode$1;->$value:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
