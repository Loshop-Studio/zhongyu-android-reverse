.class public final synthetic Lz5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Landroidx/compose/runtime/MutableState;

.field public final synthetic d:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroidx/navigation/NavController;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/c;->a:Landroid/content/Context;

    iput-object p2, p0, Lz5/c;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Lz5/c;->c:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lz5/c;->d:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lz5/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lz5/c;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Lz5/c;->c:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lz5/c;->d:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt;->e(Landroid/content/Context;Landroidx/navigation/NavController;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
