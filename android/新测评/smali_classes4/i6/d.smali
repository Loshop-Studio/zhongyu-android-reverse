.class public final synthetic Li6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Landroidx/navigation/NavController;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/d;->a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput-object p2, p0, Li6/d;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Li6/d;->c:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Li6/d;->a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-object v1, p0, Li6/d;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Li6/d;->c:Landroidx/compose/runtime/State;

    invoke-static {v0, v1, v2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemPageKt;->e(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Landroidx/navigation/NavController;Landroidx/compose/runtime/State;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
