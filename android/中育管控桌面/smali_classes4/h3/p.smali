.class public final synthetic Lh3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lh3/d0;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lh3/d0;Landroidx/navigation/NavController;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/p;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lh3/p;->b:Lh3/d0;

    iput-object p3, p0, Lh3/p;->c:Landroidx/navigation/NavController;

    iput-object p4, p0, Lh3/p;->d:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lh3/p;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lh3/p;->b:Lh3/d0;

    iget-object v2, p0, Lh3/p;->c:Landroidx/navigation/NavController;

    iget-object v3, p0, Lh3/p;->d:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2, v3}, Lh3/v;->c(Lkotlin/jvm/functions/Function1;Lh3/d0;Landroidx/navigation/NavController;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
