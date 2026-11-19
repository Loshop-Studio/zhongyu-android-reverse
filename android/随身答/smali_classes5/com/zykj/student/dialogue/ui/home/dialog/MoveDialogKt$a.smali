.class public final Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->h(Landroidx/navigation/NavHostController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

.field public final synthetic b:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$a;->a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$a;->b:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$a;->b:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$a;->a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->t(Landroidx/compose/runtime/MutableState;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$a;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object v0
.end method
