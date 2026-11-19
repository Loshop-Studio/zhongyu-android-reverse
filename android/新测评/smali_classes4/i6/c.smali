.class public final synthetic Li6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/c;->a:Landroidx/navigation/NavController;

    iput-object p2, p0, Li6/c;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Li6/c;->a:Landroidx/navigation/NavController;

    iget-object v1, p0, Li6/c;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemPageKt;->d(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
