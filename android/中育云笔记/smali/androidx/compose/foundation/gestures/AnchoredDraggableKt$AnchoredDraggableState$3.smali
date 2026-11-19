.class final Landroidx/compose/foundation/gestures/AnchoredDraggableKt$AnchoredDraggableState$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AnchoredDraggableKt;->AnchoredDraggableState$default(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lhd/l;Lhd/a;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lhd/l;ILjava/lang/Object;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/foundation/gestures/AnchoredDraggableKt$AnchoredDraggableState$3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$AnchoredDraggableState$3;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$AnchoredDraggableState$3;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$AnchoredDraggableState$3;->INSTANCE:Landroidx/compose/foundation/gestures/AnchoredDraggableKt$AnchoredDraggableState$3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$AnchoredDraggableState$3;->invoke(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
