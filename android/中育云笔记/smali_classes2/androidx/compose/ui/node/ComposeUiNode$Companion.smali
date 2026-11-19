.class public final Landroidx/compose/ui/node/ComposeUiNode$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/node/ComposeUiNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion;

.field private static final Constructor:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private static final SetCompositeKeyHash:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private static final SetDensity:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private static final SetLayoutDirection:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private static final SetMeasurePolicy:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private static final SetModifier:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private static final SetResolvedCompositionLocals:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private static final SetViewConfiguration:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private static final VirtualConstructor:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->$$INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/ui/node/LayoutNode;->Companion:Landroidx/compose/ui/node/LayoutNode$Companion;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode$Companion;->getConstructor$ui_release()Lhd/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->Constructor:Lhd/a;

    .line 15
    .line 16
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion$VirtualConstructor$1;->INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion$VirtualConstructor$1;

    .line 17
    .line 18
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->VirtualConstructor:Lhd/a;

    .line 19
    .line 20
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion$SetModifier$1;->INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion$SetModifier$1;

    .line 21
    .line 22
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetModifier:Lhd/p;

    .line 23
    .line 24
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion$SetDensity$1;->INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion$SetDensity$1;

    .line 25
    .line 26
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetDensity:Lhd/p;

    .line 27
    .line 28
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion$SetResolvedCompositionLocals$1;->INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion$SetResolvedCompositionLocals$1;

    .line 29
    .line 30
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetResolvedCompositionLocals:Lhd/p;

    .line 31
    .line 32
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion$SetMeasurePolicy$1;->INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion$SetMeasurePolicy$1;

    .line 33
    .line 34
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetMeasurePolicy:Lhd/p;

    .line 35
    .line 36
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion$SetLayoutDirection$1;->INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion$SetLayoutDirection$1;

    .line 37
    .line 38
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetLayoutDirection:Lhd/p;

    .line 39
    .line 40
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion$SetViewConfiguration$1;->INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion$SetViewConfiguration$1;

    .line 41
    .line 42
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetViewConfiguration:Lhd/p;

    .line 43
    .line 44
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion$SetCompositeKeyHash$1;->INSTANCE:Landroidx/compose/ui/node/ComposeUiNode$Companion$SetCompositeKeyHash$1;

    .line 45
    .line 46
    sput-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetCompositeKeyHash:Lhd/p;

    .line 47
    .line 48
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getConstructor()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->Constructor:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSetCompositeKeyHash()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetCompositeKeyHash:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSetDensity()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetDensity:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSetLayoutDirection()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetLayoutDirection:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSetMeasurePolicy()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetMeasurePolicy:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSetModifier()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetModifier:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSetResolvedCompositionLocals()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetResolvedCompositionLocals:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSetViewConfiguration()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->SetViewConfiguration:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVirtualConstructor()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode$Companion;->VirtualConstructor:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method
