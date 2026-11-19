.class final Landroidx/compose/foundation/text/ContextMenu_androidKt$getContextMenuItemsAvailability$2;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/ContextMenu_androidKt;->getContextMenuItemsAvailability(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.foundation.text.ContextMenu_androidKt"
    f = "ContextMenu.android.kt"
    l = {
        0xa7
    }
    m = "getContextMenuItemsAvailability"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/text/ContextMenu_androidKt$getContextMenuItemsAvailability$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$getContextMenuItemsAvailability$2;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$getContextMenuItemsAvailability$2;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$getContextMenuItemsAvailability$2;->label:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Landroidx/compose/foundation/text/ContextMenu_androidKt;->getContextMenuItemsAvailability(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
